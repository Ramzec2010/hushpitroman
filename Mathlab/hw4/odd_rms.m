function [ orms ] = odd_rms( nn )
n=zeros(1,nn);
i=1:2:2*nn-1;
n=i;
orms=sqrt((sum((n).^2)/length(n)));
end

