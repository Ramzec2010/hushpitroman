function exp_a = exp_average( n,bb )
persistent b
persistent total
if nargin>1 && isempty(b)
    b=bb;
    total=n;
elseif nargin>1 && ~isempty(b)
    b=bb;
    total=n;
elseif nargin<2 &&isempty(b) &&isempty(total)
    b=0.1;
    total=n;
elseif nargin<2 &&~isempty(total)&&~isempty(b)
    total=b*n+(1-b)*total;
end
exp_a=total;
end

