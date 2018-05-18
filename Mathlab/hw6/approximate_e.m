function [apr_e, k] = approximate_e( delta )
%UNTITLED Summary of this function goes here
%   Detailed explanation goes here
apr_e=1;
k=0;
jj=1;
b=exp(1);
while b-apr_e>delta
    k=k+1;
    apr_e=apr_e+1/(jj*k);
    jj=jj*k;
    
end

end

