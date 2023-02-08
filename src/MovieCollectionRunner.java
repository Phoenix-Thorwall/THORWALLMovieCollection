public class MovieCollectionRunner {
  public static void main(String[] args) {
    String csvFile = "src\\movies_data.csv";
    MovieCollection cinema = new MovieCollection(csvFile);
    cinema.menu();



  }
}