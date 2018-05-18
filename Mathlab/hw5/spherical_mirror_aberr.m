function mbd = spherical_mirror_aberr(fn,D)
%UNTITLED3 Summary of this function goes here
%   Detailed explanation goes here
delta_x=0.01;
x=0:delta_x:D/2;
f=fn*D;
teta=(asin(x./(2.*f)));
d=2.*f.*tan(2.*teta).*((1./cos(teta))-1);
a=sum(d.*x);
mbd=(8*delta_x/(D^2))*a;

end

