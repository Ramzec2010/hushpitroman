function n = palin_product(dig,lim)
ii=0;
if lim<=999
A=ii:lim;
C=[];
else
    A=ii:999;
    D=1000:lim;
C=[];
end
for ii=1:length(A)
    B=num2str(A(ii));
    if B(1)==B(end)
        B=str2double(B);
        C=[C B];
    else
        C=[C];
    end
end
if lim>=1000
jj=0;
for jj=1:length(D)
    B=num2str(D(jj));
    if B(1)==B(end)&&B(2)==B(end-1)
        B=str2double(B);
        C=[C B];
    else
        C=[C];
    end
end
end
if dig==1
   n=9;
elseif dig==2
    X_Y=[];
    X=10:99;
    Y=10:99;
    for ss=1:length(X)
        mult=X(ss).*Y;
        X_Y=[X_Y;mult];
    end
X_Y_LIM=X_Y(X_Y<lim);
M=[];
for oo=1:length(X_Y_LIM)
    mm=C(C==X_Y_LIM(oo));
    M=[M mm];
    
end
n=max(M);
elseif dig==3
    X_Y=[];
    X=100:999;
    Y=100:999;
    for ss=1:length(X)
        mult=X(ss).*Y;
        X_Y=[X_Y;mult];
    end
X_Y_LIM=X_Y(X_Y<lim);
M=[];
for oo=1:length(X_Y_LIM)
    mm=C(C==X_Y_LIM(oo));
    M=[M mm];
    
end
n=max(M);
    
end
if length(n)==0
    n=0;
end
end


