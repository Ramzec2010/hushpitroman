function [S] = simple_stats(N)
nOFr = size(N,1);
nOFc=size(N,2);
S=zeros(nOFr,4);
S(:,1)=sum(N,2);
S(:,1)=S(:,1)/nOFc;
S(:,2)=median(N,2);%2 - индекс, означающий направление(вдоль сток)
S(:,3)=min(N,[],2);
S(:,4)=max(N,[],2);
end

