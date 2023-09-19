package employee;

import entities.Emplo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

  System.out.println("How many employees will be registered? ");
  int n = sc.nextInt();
  List<Emplo>emp = new ArrayList<>();
  
  for(int x = 0; x<n;x++){
      System.out.println("Employee #"+x+":");
      
      System.out.println("Id: ");
      int id = sc.nextInt();
      
      System.out.println("Name: ");
      sc.nextLine();
      String name = sc.nextLine();
      
      System.out.println("Salary: ");
      double sal = sc.nextDouble();
      
      emp.add(new Emplo(id,name,sal));
      
  }
 
System.out.println("Enter the employee id that will have salary increase: ");
int id = sc.nextInt();

Emplo empl = emp.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

if(empl == null){
    System.out.println("This id does not exist!");
    System.out.println("");
}
else{
    System.out.println("Enter the percentage: ");
    double porc = sc.nextDouble();
    empl.increaseSalary(porc);
    System.out.println("");
}

for(Emplo obj : emp ){
    System.out.println(obj);
}
    }
    
}
