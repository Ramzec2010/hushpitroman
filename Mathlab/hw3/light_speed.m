function [ t,S_mile] = light_speed( s )
%UNTITLED4 Summary of this function goes here
%   Detailed explanation goes here
V=300000*60; %km/s
t=s./V;
S_mile=s./1.609;
end

