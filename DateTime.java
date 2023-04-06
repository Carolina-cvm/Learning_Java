import java.time.LocalDate;  
import java.time.LocalTime;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;

public class Main {  
  public static void main(String[] args) {  
    // data
    LocalDate objDate = LocalDate.now();  
    System.out.println(objDate); // 2023-04-06

    // hora
    LocalTime objTime = LocalTime.now();
    System.out.println(objTime); // 13:49:29.629650

    // data e hora
    LocalDateTime objDataTime = LocalDateTime.now();
    System.out.println(objDataTime); // 2023-04-06T13:49:29.629053

    // formatar
    DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
    String formattedDateTime = objDataTime.format(formatObj);  
    System.out.println("Data e hora formatada:" + formattedDateTime); 
  }  
}  
