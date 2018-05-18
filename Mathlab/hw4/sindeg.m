function [ M, ave ] = sindeg( deg )
n=deg*pi/180;
M=sin(n);
A=sum(M);
B=sum(A);
c=size(M);
f=c(1)*c(2);
ave=B/f;
end

