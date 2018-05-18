function [ perc ] = zero_stat( A )
b=sum(A);
c=sum(b);
d=size(A);
e=prod(d); %#ok<PSIZE>
perc=((e-c)/e)*100;

end

