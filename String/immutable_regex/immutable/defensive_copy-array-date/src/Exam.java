import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public final class Exam {
    private final String subject;
    private final int[] scores;
//    private final Date date;
    private final LocalDate date;

    // constructor nhận (String, int[], Date)
    public Exam(String subject, int[] scores, LocalDate date) {
        this.subject = Objects.requireNonNull(subject).trim().toLowerCase();
        if (this.subject.isEmpty()) throw new IllegalArgumentException("Subject không được để trống!");
        this.scores = Objects.requireNonNull(scores, "scores trong!").clone();
        this.date = Objects.requireNonNull(date, "date trống!");
//        this.date = new Date(date.getTime());
    }

    public String getSubject() {
        return subject;
    }

    public int[] getScores() {
        return scores.clone();
    }

    public LocalDate getDate() {
        return date;
//        return new Date(date.getTime());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Exam exam = (Exam) o;
        return Objects.equals(subject, exam.subject) && Objects.deepEquals(scores, exam.scores) && Objects.equals(date, exam.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject, Arrays.hashCode(scores), date);
    }

    @Override
    public String toString() {
        return "Exam{" +
                "subject='" + subject + '\'' +
                ", scores=" + Arrays.toString(scores) +
                ", date=" + date +
                '}';
    }
}