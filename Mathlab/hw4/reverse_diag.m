function [ N ] = reverse_diag( n )
N=zeros(n);
N(n:n-1:n^2-n+1)=1;
end
