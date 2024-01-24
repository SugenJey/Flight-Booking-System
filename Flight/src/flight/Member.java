/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flight;

/**
 *
 * @author sugen
 */
public class Member extends Passenger {
  int yearsOfMembership;  

    public Member(String name, int age,int yearsOfMembership) {
        super(name,age);
        this.yearsOfMembership = yearsOfMembership;
    }
    
  @Override
    public double applyDiscount(double p)
    {
         if(yearsOfMembership>5)
         {
             return 0.50*p;
         }
         else if(yearsOfMembership>1)
         {
             return 0.90*p;
         }
         else
         {
             return p;
         }
    } 
}
