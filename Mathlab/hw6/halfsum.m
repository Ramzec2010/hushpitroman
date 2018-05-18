function B = halfsum( A )
%UNTITLED Summary of this function goes here
%   Detailed explanation goes here
[a b] = size(A);% a - колоичество строк, b - количество столбцов
c=1;
B=0;
for ii=a:-1:1
       B=B+sum(A(ii,c:b));
       c=c+1;
end
B;        
end

