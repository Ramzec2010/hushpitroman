function A = small_elements( X )
%UNTITLED2 Summary of this function goes here
%   Detailed explanation goes here
ii=0;
A=[];
[x,y]=size(X);
for b=1:y
    for a=1:x
        if X(a,b)<a*b
            ii=ii+1;
            A(ii,1)=a;
            A(ii,2)=b;
        end
    end
end
end

