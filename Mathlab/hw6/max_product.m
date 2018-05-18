function [product, ind] = max_product( v,n )
%UNTITLED3 Summary of this function goes here
%   Detailed explanation goes here
if length(v)<n
    product=0;
    ind=-1;
    return
end
B=[];
ii=1;
k=n;
for v_i = 1:length(v)-n+1% +1 чтобі включить в проверку последние  n єлементов
    V=prod(v(ii:k));
    ii=ii+1;
    k=k+1;
    B=[B V];
end
[product, ind] = max(B(:));
end

