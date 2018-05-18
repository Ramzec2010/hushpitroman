function days = day_diff(month1,day1,month2,day2 )
%UNTITLED2 Summary of this function goes here
%   Detailed explanation goes here
m_d=[31 28 31 30 31 30 31 31 30 31 30 31];

if  ~isscalar(month1)||~isscalar(day1)||~isscalar(month2)||~isscalar(day2) ...%”словие проверки числа(скал€р или вектор)
    ||fix(month1)~=month1||fix(month2)~=month2||fix(day1)~=day1||fix(day2)~=day2 ...%÷елое число или с зап€той
        ||month1<=0||month1>12||month2<=0||month2>12 ...
        ||day1>m_d(month1)||day2>m_d(month2)||day1<=0||day2<=0   
    days=-1;

elseif month1==month2&&day1>day2
    days=day1-day2;
elseif month1==month2&&day1>day2
    days=day2-day1;
elseif month1>month2
    days=sum(m_d(month2:month1-1))-day2+day1;
else
    days=sum(m_d(month1:month2-1))-day1+day2;
end
end

