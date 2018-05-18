function v= triangle_wave( n )
%UNTITLED Summary of this function goes here
%   Detailed explanation goes here
k=0:n;
t = linspace(0, 4*pi, 1001);
v=zeros(1,length(t));
for tI = 1 : length(t)
    n=((-1).^k) .* sin(t(tI).*(2 * k + 1));
  d=(2.*k+1).^2;
  v(tI)=sum(n./ d);
end
end

