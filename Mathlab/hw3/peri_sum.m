function [ s ] = peri_sum( A )
first_row=A(1,:);
last_row=A(end,:);
first_colum=A(2:end-1,1);
last_colum=A(2:end-1,end);
s1=sum(first_row);
s2=sum(last_row);
s3=sum(first_colum);
s4=sum(last_colum);
s=s1+s2+s3+s4;
end

