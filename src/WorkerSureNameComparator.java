import java.util.Comparator;

public class WorkerSureNameComparator implements Comparator<Worker> {

    @Override
    public int compare(Worker o1, Worker o2) {

        return o1.getSureName().compareTo(o2.getSureName());
    }
}