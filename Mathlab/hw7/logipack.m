function v = logipack (A)
%UNTITLED2 Summary of this function goes here
%   Detailed explanation goes here
lp=cell(1,length(A));
for ii=1:length(lp)
    if sum(A(ii,:))==0
        lp{ii}=[];
    else
    lp{ii}=find(A(ii,:));
    end
v=lp;
end
end

