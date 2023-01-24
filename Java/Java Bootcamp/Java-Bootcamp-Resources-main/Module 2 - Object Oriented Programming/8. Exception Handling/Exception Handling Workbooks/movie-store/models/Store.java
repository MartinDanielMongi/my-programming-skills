package models;

import java.util.ArrayList;

public class Store {
    ArrayList<Movie> movie;

    public Store(Movie source) {
    }

    public Store() {
        this.movie = new ArrayList<Movie>();
    }

    public Movie getMovie(int index) {
        return movie.get(index);
    }

    public void setMovie(int index, Movie movie) {
        this.movie.set(index, new Movie(movie));
    }
    public void addMovie(Movie movie){
        this.movie.add(new Movie(movie));
    }

    public void action(String name, String action){
        if(!action.equals("Sell") && !action.equals("Rent")&& !action.equals("Return")){
            throw new IllegalArgumentException("Must be Sell, Return or Rent");
        }
        if(name==null || name.isBlank()){
            throw new  IllegalArgumentException("Name cant be null or blanck");
        }
        if(movie.isEmpty()){
            throw new IllegalStateException("The Store its empty");
        }
        switch (action) {
            case "Rent":
                for(int i=0; i<movie.size(); i++){
                    if(name.equals(movie.get(i).getName())){
                        movie.get(i).setIsAvailable(false);
                }
            }
                break;
            case "Sell":
                for(int i=0; i<movie.size(); i++){
                    if(name.equals(movie.get(i).getName())){
                        if(movie.get(i).getIsAvailable()){
                            movie.remove(i);
                        }else{
                            System.out.println("The movie its rented");
                            throw new IllegalStateException("The movie its rented");
                        }
                }
            }
                break;
            case "Return":
                for(int i=0; i<movie.size(); i++){
                    if(name.equals(movie.get(i).getName())){
                        movie.get(i).setIsAvailable(true);
                    }
                }

                break;

            default:
                break;
        }

    }
    public String toString(){
        String temp= " ";
            for (int i = 0; i < movie.size(); i++) {
                temp += movie.get(i).toString();
                temp += "\n";
            }

        return temp;
    }

}
