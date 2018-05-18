function x = find_zero(f,x1,x2)
%UNTITLED Summary of this function goes here
%   Detailed explanation goes here
    y_1=f(x1);
    y_2=f(x2);
    x3=(x1+x2)/2;
    y_3=f(x3);
    x=x3;
while abs(y_3)>=1e-10
    y_1=f(x1);
    y_2=f(x2);
    x3=(x1+x2)/2;
    y_3=f(x3);
    if y_1*y_3<0
        x2=x3;
    else
        x1=x3;
    end
x=x3;    
end
end

