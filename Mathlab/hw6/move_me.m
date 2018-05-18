function w = move_me(v,a)
%UNTITLED Summary of this function goes here
%   Detailed explanation goes here

if nargin<2
    a=0;
end
if size(v)==1
    w=v;
else
    for ii=1:length(v)
    for jj=1:length(v)-1
    if v(jj)==a
        w=v;
        w(jj)=v(jj+1);
        w(jj+1)=v(jj);
        v=w;
    end

    end
    end
    w=v;
end


