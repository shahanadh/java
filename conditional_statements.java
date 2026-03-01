A - Print Many Hello World

public class Main{
public static void main(String[]args){
for(int i=0;i<1000;i++){
System.out.println("Hello World");
}
}
}


B - Small, Large, or Equal 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
if(a<b)System.out.println("a < b");
else if(a>b)System.out.println("a > b");
else System.out.println("a == b");
}
}

C - Compute area of rectangle 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
long l=sc.nextLong();
long b=sc.nextLong();
System.out.println(l*b);
}
}

D - Triangle validator 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
long a=sc.nextLong();
long b=sc.nextLong();
long c=sc.nextLong();
if(a+b>c&&a+c>b&&b+c>a)System.out.println("Yes");
else System.out.println("No");
}
}

E - The missing number 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
long sum=0;
for(int i=0;i<99;i++)sum+=sc.nextLong();
long total=100L*101/2;
System.out.println(total-sum);
}
}

F - Number reverse 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
long n=sc.nextLong();
boolean neg=false;
if(n<0){neg=true;n=-n;}
long rev=0;
while(n>0){
rev=rev*10+n%10;
n/=10;
}
if(neg)System.out.println(-rev);
else System.out.println(rev);
}
}

G - Divide the apples - 2 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=sc.nextInt();
System.out.println(k%n);
}
}

I - Fever 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
int x=sc.nextInt();
if(x>98)System.out.println("YES");
else System.out.println("NO");
}
}
}

H - Watermelon 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int w=sc.nextInt();
if(w>2&&w%2==0)System.out.println("YES");
else System.out.println("NO");
}
}

J - Lunchtime 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
int x=sc.nextInt();
if(x>=1&&x<=4)System.out.println("YES");
else System.out.println("NO");
}
}
}

K - Is it hot or cold 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
int c=sc.nextInt();
if(c>20)System.out.println("HOT");
else System.out.println("COLD");
}
}
}

L - ATM 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
double y=sc.nextDouble();
if(x%5==0&&y>=x+0.50)y=y-x-0.50;
System.out.printf("%.2f",y);
}
}

N - TV Discount 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=sc.nextInt();
int p1=a-c;
int p2=b-d;
if(p1<p2)System.out.println("First");
else if(p2<p1)System.out.println("Second");
else System.out.println("Any");
}
}
}

O - Battery Low 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
int x=sc.nextInt();
if(x<=15)System.out.println("Yes");
else System.out.println("No");
}
}
}

P - Chef and Candies 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
int n=sc.nextInt();
int x=sc.nextInt();
if(x>=n)System.out.println(0);
else{
int need=n-x;
int packets=need/4;
if(need%4!=0)packets++;
System.out.println(packets);
}
}
}
}

Q - Minimum Pizzas 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
int n=sc.nextInt();
int x=sc.nextInt();
int total=n*x;
int pizzas=total/4;
if(total%4!=0)pizzas++;
System.out.println(pizzas);
}
}
}

R - Sugarcane Juice Business 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
long n=sc.nextLong();
long income=50*n;
long profit=income/100*30;
System.out.println(profit);
}
}
}

S - Watching Movies at 2x 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
int time=y/2+(x-y);
System.out.println(time);
}
}

T - Sum OR Difference 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
if(n1>n2)System.out.println(n1-n2);
else System.out.println(n1+n2);
}
}

U - Second Largest 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if((a>=b&&a<=c)||(a>=c&&a<=b))System.out.println(a);
else if((b>=a&&b<=c)||(b>=c&&b<=a))System.out.println(b);
else System.out.println(c);
}
}
}

V - Helping Chef 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
int n=sc.nextInt();
if(n<10)System.out.println("Thanks for helping Chef!");
else System.out.println("-1");
}
}
}


W - Lucky Four 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
int n=sc.nextInt();
if(n<10)System.out.println("Thanks for helping Chef!");
else System.out.println("-1");
}
}
}

X - Compute N! 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int fact=1;
for(int i=1;i<=n;i++)fact*=i;
System.out.println(fact);
}
}

Z - Squares sum 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
long sum=0;
for(int i=1;i<=n;i++)sum+=1L*i*i;
System.out.println(sum);
}
}