A - Matrix Row Sum 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
for(int i=0;i<n;i++){
long sum=0;
for(int j=0;j<m;j++)sum+=sc.nextLong();
System.out.println(sum);
}
}
}

B - Matrix column sum 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
for(int i=0;i<n;i++){
long sum=0;
for(int j=0;j<m;j++)sum+=sc.nextLong();
System.out.println(sum);
}
}
}

C - Sum of two matrices 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
long[][]a=new long[n][m];
for(int i=0;i<n;i++){
for(int j=0;j<m;j++)a[i][j]=sc.nextLong();
}
for(int i=0;i<n;i++){
for(int j=0;j<m;j++){
a[i][j]+=sc.nextLong();
}
}
for(int i=0;i<n;i++){
for(int j=0;j<m;j++)System.out.print(a[i][j]+" ");
System.out.println();
}
}
}

D - Transpose matrix 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
long[][]a=new long[n][m];
for(int i=0;i<n;i++){
for(int j=0;j<m;j++)a[i][j]=sc.nextLong();
}
for(int j=0;j<m;j++){
for(int i=0;i<n;i++)System.out.print(a[i][j]+" ");
System.out.println();
}
}
}

E - A sparse matrix 


import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int zeros=0;
for(int i=0;i<n;i++){
for(int j=0;j<m;j++){
if(sc.nextLong()==0)zeros++;
}
}
if(zeros>(n*m)/2)System.out.println("Yes");
else System.out.println("No");
}
}

F - Rotation of Matrix 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
int n=sc.nextInt();
int[][]a=new int[n][n];
for(int i=0;i<n;i++){
for(int j=0;j<n;j++)a[i][j]=sc.nextInt();
}
for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){
int temp=a[i][j];
a[i][j]=a[j][i];
a[j][i]=temp;
}
}
for(int i=0;i<n;i++){
for(int j=0;j<n/2;j++){
int temp=a[i][j];
a[i][j]=a[i][n-1-j];
a[i][n-1-j]=temp;
}
}
for(int i=0;i<n;i++){
for(int j=0;j<n;j++)System.out.print(a[i][j]+" ");
System.out.println();
}
}
}
}


G - Diagonal Traversal of Matrix 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
int n=sc.nextInt();
int[][]a=new int[n][n];
for(int i=0;i<n;i++){
for(int j=0;j<n;j++)a[i][j]=sc.nextInt();
}
for(int d=0;d<2*n-1;d++){
long sum=0;
for(int i=0;i<n;i++){
int j=d-i;
if(j>=0&&j<n)sum+=a[i][j];
}
System.out.print(sum+" ");
}
System.out.println();
}
}
}

H - Spiral Traversal of Matrix 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
int n=sc.nextInt();
int[][]a=new int[n][n];
for(int i=0;i<n;i++){
for(int j=0;j<n;j++)a[i][j]=sc.nextInt();
}
int top=0,bottom=n-1,left=0,right=n-1;
while(top<=bottom&&left<=right){
for(int i=left;i<=right;i++)System.out.print(a[top][i]+" ");
top++;
for(int i=top;i<=bottom;i++)System.out.print(a[i][right]+" ");
right--;
if(top<=bottom){
for(int i=right;i>=left;i--)System.out.print(a[bottom][i]+" ");
bottom--;
}
if(left<=right){
for(int i=bottom;i>=top;i--)System.out.print(a[i][left]+" ");
left++;
}
}
System.out.println();
}
}
}

I - Product of 2 Matrices 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
int n1=sc.nextInt();
int m1=sc.nextInt();
long[][]a=new long[n1][m1];
for(int i=0;i<n1;i++){
for(int j=0;j<m1;j++)a[i][j]=sc.nextLong();
}
int n2=sc.nextInt();
int m2=sc.nextInt();
long[][]b=new long[n2][m2];
for(int i=0;i<n2;i++){
for(int j=0;j<m2;j++)b[i][j]=sc.nextLong();
}
long[][]c=new long[n1][m2];
for(int i=0;i<n1;i++){
for(int j=0;j<m2;j++){
for(int k=0;k<m1;k++)c[i][j]+=a[i][k]*b[k][j];
}
}
for(int i=0;i<n1;i++){
for(int j=0;j<m2;j++)System.out.print(c[i][j]+" ");
System.out.println();
}
}
}
}

J - Trace of Matrix 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
int n=sc.nextInt();
int[][]a=new int[n][n];
for(int i=0;i<n;i++){
for(int j=0;j<n;j++)a[i][j]=sc.nextInt();
}
int max=0;
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
int sum=0,r=i,c=j;
while(r<n&&c<n){
sum+=a[r][c];
if(sum>max)max=sum;
r++;
c++;
}
}
}
System.out.println(max);
}
}
}

K - Image Flip 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int[][]a=new int[n][m];
for(int i=0;i<n;i++){
for(int j=0;j<m;j++)a[i][j]=sc.nextInt();
}
for(int i=0;i<n;i++){
for(int j=0;j<m/2;j++){
int temp=a[i][j];
a[i][j]=a[i][m-1-j];
a[i][m-1-j]=temp;
}
for(int j=0;j<m;j++)a[i][j]=a[i][j]==0?1:0;
}
for(int i=0;i<n;i++){
for(int j=0;j<m;j++)System.out.print(a[i][j]+" ");
System.out.println();
}
}
}

M - Zero Row and Zero Column 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int[][]a=new int[n][m];
for(int i=0;i<n;i++){
for(int j=0;j<m;j++)a[i][j]=sc.nextInt();
}
boolean[]row=new boolean[n];
boolean[]col=new boolean[m];
for(int i=0;i<n;i++){
for(int j=0;j<m;j++){
if(a[i][j]==0){
row[i]=true;
col[j]=true;
}
}
}
for(int i=0;i<n;i++){
for(int j=0;j<m;j++){
if(row[i]||col[j])a[i][j]=0;
}
}
for(int i=0;i<n;i++){
for(int j=0;j<m;j++)System.out.print(a[i][j]+" ");
System.out.println();
}
}
}

N - Matrix Layer Rotation 

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int n=sc.nextInt();
int r=sc.nextInt();
int[][]a=new int[m][n];
for(int i=0;i<m;i++){
for(int j=0;j<n;j++)a[i][j]=sc.nextInt();
}
int layers=Math.min(m,n)/2;
for(int l=0;l<layers;l++){
ArrayList<Integer>list=new ArrayList<>();
for(int j=l;j<n-l;j++)list.add(a[l][j]);
for(int i=l+1;i<m-l-1;i++)list.add(a[i][n-l-1]);
for(int j=n-l-1;j>=l;j--)list.add(a[m-l-1][j]);
for(int i=m-l-2;i>l;i--)list.add(a[i][l]);
int size=list.size();
int rot=r%size;
ArrayList<Integer>rotated=new ArrayList<>();
for(int i=0;i<size;i++)rotated.add(list.get((i+rot)%size));
int idx=0;
for(int j=l;j<n-l;j++)a[l][j]=rotated.get(idx++);
for(int i=l+1;i<m-l-1;i++)a[i][n-l-1]=rotated.get(idx++);
for(int j=n-l-1;j>=l;j--)a[m-l-1][j]=rotated.get(idx++);
for(int i=m-l-2;i>l;i--)a[i][l]=rotated.get(idx++);
}
for(int i=0;i<m;i++){
for(int j=0;j<n;j++)System.out.print(a[i][j]+" ");
System.out.println();
}
}
}
