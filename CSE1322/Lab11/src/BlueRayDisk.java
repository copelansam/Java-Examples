public class BlueRayDisk {
    public String title;
    public String director;
    public int releaseYear;
    public double cost;

    BlueRayDisk(String title, String director, int year, double cost){
        this.title = title;
        this.director = director;
        releaseYear= year;
        this.cost = cost;
    }

    @Override
    public String toString(){
        return "$" + cost + " " + releaseYear + " " + title + ", " + director;
    }
}
