
/*
 * Superclass --> Staff (Staffid , name , phone , salary)
 * Subclass --> 1. Teaching(domain , publications)
 * 2. Technical(skills)
 * 3. Contract( period )
 * 
 * StaffId  Name    Phone   salary     Domain    Publication     Skills     Period     
 * 
 */
import java.util.*;

import javax.print.attribute.standard.Sides;

class Staff {
    String StaffId, Name, Phone;
    int Salary;

    Staff(String sid, String nm, String phn, int slry) {
        StaffId = sid;
        Name = nm;
        Phone = phn;
        Phone = phn;
        Salary = slry;
    }

    public void display() {
        System.out.print(StaffId + "\t\t" + Name + "\t\t" + Phone + "\t\t" + Salary + "\t\t");
    }
}

class Teaching extends Staff {
    String domain, publication;

    Teaching(String sid, String nm, String phn, int slry, String dm, String pub) {
        super(sid, nm, phn, slry);
        domain = dm;
        publication = pub;

    }

    public void display() {
        super.display();
        System.out.println(domain + "\t\t" + publication + "\t\t*****\t\t*****");
    }

}

class Technical extends Staff {
    String skills;

    Technical(String sid, String nm, String phn, int slry, String skl) {
        super(sid, nm, phn, slry);
        skills = skl;

    }

    public void display() {
        super.display();
        System.out.println("*****\t\t*****\t\t" + skills + "\t\t*****");
    }

}

class Contract extends Staff {
    int Period;

    Contract(String sid, String nm, String phn, int slry, int prd) {
        super(sid, nm, phn, slry);
        Period = prd;
    }

    public void display() {
        super.display();
        System.out.println("*****\t\t*****\t\t*****\t\t" + Period);
    }
}

public class p2_a {
    public static void main(String[] args) {
        Staff[] s = new Staff[3];
        // StaffId Name Phone salary Domain Publication Skills Period

        s[0] = new Teaching("101", "Abhi", "5432", 12000, "AIML", "OPEN CV");
        s[1] = new Technical("102", "Glen", "6323", 22000, "ROS");
        s[2] = new Contract("103", "XYZ", "2341", 2000, 12);
        System.out.println("StaffId\t\tName\t\tPhone\t\tSalary\t\tDomain\t\tPublication\t\tSkills\t\tPeriod");
        for (int i = 0; i < 3; i++)
            s[i].display();

    }

}
