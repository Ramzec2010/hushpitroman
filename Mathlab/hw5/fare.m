function [ f_dolar ] = fare( miles, age )

%UNTITLED Summary of this function goes here
%   Detailed explanation goes here
if miles<=1
    f_dolar=(ceil(miles))*2;
elseif miles>1 && miles<=10
    f_dolar = 2+(round(miles-1))*0.25;
else 
    f_dolar = 2+9*0.25+(round(miles-10))*0.1;
end
if age<=18||age>=60
    f_dolar = f_dolar*0.8;
else
end

end

