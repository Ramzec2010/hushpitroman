function [ prb ] = income( rate,price )
t=6*8*2;
inc=rate.*price.*t;
prb=sum(inc);
end

