import java.util.ArrayList;
public class Main{
    public static void main (String[] args){
        Review[] review = {new Review(4, "Good! Thx"), new Review(3, "OK Site"), new Review(5, "Great!"), new Review(2, "Poor! Bad"), new Review(3, "")};
        ReviewAnalysis analyze = new ReviewAnalysis(review);
        System.out.println(analyze.getAverageRating());
        System.out.println(analyze.collectComments());
    }
}