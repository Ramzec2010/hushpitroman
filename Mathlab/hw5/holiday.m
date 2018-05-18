function a= holiday( month, day )
%UNTITLED Summary of this function goes here
%   Detailed explanation goes here
m=[1:12];
d=[1:31];
a=(m(month)==1&&d(day)==1)||(m(month)==7&&d(day)==4)||(m(month)==12&&d(day)==25)||(m(month)==12&&d(day)==31);
end

