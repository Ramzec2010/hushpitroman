function [ a,b,c ] = sort3(v)
%UNTITLED Summary of this function goes here
%   Detailed explanation goes here
if v(1)<=v(2)&&v(1)<=v(3)
    mi=v(1);
elseif v(1)>v(2)&&v(1)>=v(3)
    ma=v(1);
else
    mid=v(1);
end
if v(2)<v(1)&&v(2)<=v(3)
    mi=v(2);
elseif v(2)>=v(1)&&v(2)>=v(3)
    ma=v(2);
else
    mid=v(2);
end
if v(3)<v(1)&&v(3)<v(2)
    mi=v(3);
elseif v(3)>v(2)&&v(3)>=v(1)
    ma=v(3);
else
    mid=v(3);
end
a=mi;
b=mid;
c=ma;
end

