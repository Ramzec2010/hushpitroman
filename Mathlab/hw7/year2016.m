function A =year2016(m)
if ~isscalar(m)||m<=0||m>12||fix(m)~=m
    A=[];
    return
end
month_name = {'January';'February';'March';'April';'May';'June';'July';'August';'September';'October';'November';'December'};
days_name = {'Mon','Tue','Wed','Thu','Fri','Sat','Sun'};
numb_of_days=datenum([2016,m,1]):datenum([2016,m+1,1])-1;
day_number=1+mod(numb_of_days-3,7);
A=struct('day',days_name(day_number),'date',num2cell(1:numel(numb_of_days)));
[A(:).month]=deal(month_name{m});
end

