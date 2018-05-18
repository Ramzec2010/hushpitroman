function p = poly_val(c0, c , x)
%UNTITLED2 Summary of this function goes here
%   Detailed explanation goes here
if isempty(c)
    p=c0;
else
    a=1:length(c);
    p=c0+sum(c(:).*(x.^a(:)));
end

