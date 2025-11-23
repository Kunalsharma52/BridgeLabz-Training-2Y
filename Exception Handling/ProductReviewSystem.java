class InvalidRatingException extends Exception { public InvalidRatingException(String m){ super(m); } }
class EmptyReviewException extends Exception { public EmptyReviewException(String m){ super(m); } }

public class ProductReviewSystem {
    public static void submitReview(int rating, String comment) {
        try {
            if(rating < 1 || rating > 5) throw new InvalidRatingException("Rating must be 1-5");
            if(comment == null || comment.isEmpty()) throw new EmptyReviewException("Comment cannot be empty");
            System.out.println("Review submitted");
        } catch(InvalidRatingException | EmptyReviewException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        submitReview(6,"Good product");
        submitReview(5,"");
    }
}
