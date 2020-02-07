/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chocolatedetails;

import java.util.*;
class ChocolateDetails
{
public static void main(String args[])
{
int i=0,j=0,k=0;
System.out.println("enter how many sweets");
Scanner s= new Scanner(System.in);
int n=s.nextInt();
Chocolate[] c = new Chocolate[n];

//Chocolate c[]=[n];
for(i=0;i<n;i++)
{
System.out.println("enter ChocolateName,Weight"+(i+1));
String cname=s.next();
s.nextLine();
float w=s.nextFloat();
c[i]=new Chocolate(cname,w);
}
for(k=0;k<n;k++)
{
for(i=0;i<n-1;i++)
{
    for(j=0;j<n-i-1;j++)
{
    if(c[j].getWeight()>c[j+1].getWeight())
    {
    //float  temp1=c[j].getWeight();
//float temp2=c[j+1].getWeight();
//Chocolate temp3=new Chocolate[n];
//temp3[k]=
    //c[j].getWeight();
    //temp3= c[j+1].getWeight();
Chocolate temp[]=new Chocolate[n];
temp[k]=new Chocolate(c[j].getType(),c[j].getWeight());
c[j]=new Chocolate(c[j+1].getType(),c[j+1].getWeight());
c[j+1]=new Chocolate(temp[k].getType(),temp[k].getWeight());




}
}
}
}
for(j=0;j<n;j++)
//for(i=0;i<n;i++)
System.out.println("Chocolate_type,"+c[i].getType()+"Weigth,"+c[j].getWeight());
}
}