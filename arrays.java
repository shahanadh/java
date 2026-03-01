A - Print array

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
long[]a=new long[n];
for(int i=0;i<n;i++)a[i]=sc.nextLong();
for(int i=0;i<n;i++)System.out.print(a[i]+" ");
}
}

B - Summation 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
long sum=0;
for(int i=0;i<n;i++)sum+=sc.nextLong();
System.out.println(sum);
}
}

C - Search with cops part 2 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
long[]a=new long[n];
for(int i=0;i<n;i++)a[i]=sc.nextLong();
long x=sc.nextLong();
boolean found=false;
for(int i=0;i<n;i++){
if(a[i]==x){
found=true;
break;
}
}
if(found)System.out.println("Yes");
else System.out.println("No");
}
}


D - Max one 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
long max=-1;
int index=0;
for(int i=0;i<n;i++){
long val=sc.nextLong();
if(i==0||val>max){
max=val;
index=i;
}
}
System.out.println(max+" "+index);
}
}

E - MIN array 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
long min=0;
int index=0;
for(int i=0;i<n;i++){
long val=sc.nextLong();
if(i==0||val<min){
min=val;
index=i;
}
}
System.out.println(index);
}
}

G - Local MAX 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
long[]a=new long[n];
for(int i=0;i<n;i++)a[i]=sc.nextLong();
int count=0;
for(int i=1;i<n-1;i++){
if(a[i]>a[i-1]&&a[i]>a[i+1])count++;
}
System.out.println(count);
}
}

H - Local MIN 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
long[]a=new long[n];
for(int i=0;i<n;i++)a[i]=sc.nextLong();
int count=0;
for(int i=1;i<n-1;i++){
if(a[i]<a[i-1]&&a[i]<a[i+1])count++;
}
System.out.println(count);
}
}

I - Fibonacci 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
long a=1,b=1;
if(n==0||n==1)System.out.println(1);
else{
for(int i=2;i<=n;i++){
long c=a+b;
a=b;
b=c;
}
System.out.println(b);
}
}
}

J - Frequency 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[]freq=new int[n+1];
for(int i=0;i<n;i++)freq[sc.nextInt()]++;
for(int i=1;i<=n;i++)System.out.println(i+": "+freq[i]);
}
}

K - Distinct 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
HashSet<Integer>set=new HashSet<>();
for(int i=0;i<n;i++)set.add(sc.nextInt());
System.out.println(set.size());
}
}


L - Max element in the array

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
long max=sc.nextLong();
for(int i=1;i<n;i++){
long val=sc.nextLong();
if(val>max)max=val;
}
System.out.println(max);
}
}

N - Sum of all odd elements

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
long sum=0;
for(int i=0;i<n;i++){
long val=sc.nextLong();
if(val%2!=0)sum+=val;
}
System.out.println(sum);
}
}

O - Find duplicate element in array 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
long[]a=new long[n];
for(int i=0;i<n;i++)a[i]=sc.nextLong();
for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){
if(a[i]==a[j]){
System.out.println(a[i]);
return;
}
}
}
}
}

P - Print unique elements of array 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
long[]a=new long[n];
for(int i=0;i<n;i++)a[i]=sc.nextLong();
for(int i=0;i<n;i++){
int count=0;
for(int j=0;j<n;j++){
if(a[i]==a[j])count++;
}
if(count==1)System.out.print(a[i]+" ");
}
}
}

Q - Linear search on array 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
long k=sc.nextLong();
int index=-1;
for(int i=0;i<n;i++){
long val=sc.nextLong();
if(val==k&&index==-1)index=i;
}
System.out.println(index);
}
}

R - Sum of array elements 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
int n=sc.nextInt();
long sum=0;
for(int i=0;i<n;i++)sum+=sc.nextLong();
System.out.println(sum);
}
}
}

S - Repeated Numbers

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
int n=sc.nextInt();
int[]freq=new int[n+1];
for(int i=0;i<n;i++)freq[sc.nextInt()]++;
int first=0,second=0;
for(int i=1;i<=n;i++){
if(freq[i]==2){
if(first==0)first=i;
else second=i;
}
}
if(first<second)System.out.println(first+" "+second);
else System.out.println(second+" "+first);
}
}
}

T - Gravity Flip 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[]a=new int[n];
for(int i=0;i<n;i++)a[i]=sc.nextInt();
for(int i=0;i<n-1;i++){
for(int j=i+1;j<n;j++){
if(a[i]>a[j]){
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(int i=0;i<n;i++)System.out.print(a[i]+" ");
}
}

U - Chef team 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
int n=sc.nextInt();
int total=0,odd=0;
for(int i=1;i*i<=n;i++){
if(n%i==0){
int d1=i,d2=n/i;
if(d1==d2){
total++;
if(d1%2!=0)odd++;
}else{
total+=2;
if(d1%2!=0)odd++;
if(d2%2!=0)odd++;
}
}
}
int even=total-odd;
if(even==odd)System.out.println(1);
else System.out.println(0);
}
}
}

V - Solve The Case 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
int n=sc.nextInt();
long prev=Long.MIN_VALUE;
for(int i=0;i<n;i++){
long val=sc.nextLong();
if(i==0||val!=prev){
System.out.print(val+" ");
prev=val;
}
}
System.out.println();
}
}
}

W - Multiply the Array 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
int n=sc.nextInt();
long prod=1;
for(int i=0;i<n;i++)prod*=sc.nextLong();
System.out.println(prod);
}
}
}

X - Compartment Weights 



import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
int n=sc.nextInt();
long total=0;
for(int i=0;i<n;i++)total+=sc.nextLong();
int q=sc.nextInt();
for(int i=0;i<q;i++){
int s=sc.nextInt();
int e=sc.nextInt();
long w=sc.nextLong();
total+=(long)(e-s+1)*w;
}
System.out.println(total);
}
}
}


Y - Birthday of Anabelle 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
int n=sc.nextInt();
long[]a=new long[n];
for(int i=0;i<n;i++)a[i]=sc.nextLong();
long target=2000;
boolean ok=false;
for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){
if(a[i]+a[j]==target){
ok=true;
break;
}
}
if(ok)break;
}
if(ok)System.out.println("Accepted");
else System.out.println("Rejected");
}
}
}

Z - Counting Pretty Numbers 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
int l=sc.nextInt();
int r=sc.nextInt();
int count=0;
for(int i=l;i<=r;i++){
int d=i%10;
if(d==2||d==3||d==9)count++;
}
System.out.println(count);
}
}
}