package aadharpanlink;

import java.util.Scanner;

public class PanAadharMatcherApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        AadhaarService aadharservice=new AadhaarService();
        PanService panService= new PanService();
        System.out.println("Enter thr Aadhar number");
        String aadharNumber = sc.nextLine();
        Aadhar aadhaar= aadharservice.getaadharbyNumber(aadharNumber);
        Pan pan= panService.getpanbyAdhar(aadharNumber);
        if(aadhaar!=null && pan!=null)
        {
            System.out.println("aadhaar details="+ aadhaar);
            System.out.println("pan details="+ pan);
        }
        else{
            System.out.println("no match found");
        }
    }
}
