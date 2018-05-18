function T = pendulum(L,a0)
%UNTITLED Summary of this function goes here
%   Detailed explanation goes here
g=9.8;
T_4=0;
teta=a0;
omega=0;
t=1*10^-6;
if a0==0||a0>pi||L==0
    T=0;
    return
end
while teta>=0
    a=-g*sin(teta)/L;
    omega=omega+a*t;
    teta=teta+omega*t;
    T_4=T_4+t;
end
T=T_4*4;
end

