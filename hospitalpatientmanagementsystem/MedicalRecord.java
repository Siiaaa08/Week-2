package hospitalpatientmanagementsystem;
import java.util.*;
public interface MedicalRecord {
    void addRecord(String record);
    ArrayList<String> viewRecords();
}
