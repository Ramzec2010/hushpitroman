function [ summ] = sum3and5muls( n )
A=[3:3:n];
B=[5:5:n];
C=[15:15:n];
summ=sum(A)+sum(B)-sum(C);
end

