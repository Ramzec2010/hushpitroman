function s= spiral_diag_sum( n )
%UNTITLED2 Summary of this function goes here
%   Detailed explanation goes here
if n==1
    s=1;
    return
end
s=1;
for a=3:2:n
    s=s+4*a^2-6*(a-1);
    
end

