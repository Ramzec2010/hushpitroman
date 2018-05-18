function n = dial(ch)
out =[];
for ii=1:length(ch)
    if ch(ii)=='A'||ch(ii)=='B'||ch(ii)=='C'
        n=('2');
        out=[out n];
    elseif ch(ii)=='D'||ch(ii)=='E'||ch(ii)=='F'
        n=('3');
        out=[out n];
    elseif ch(ii)=='G'||ch(ii)=='H'||ch(ii)=='I'
        n=('4');
        out=[out n];
    elseif ch(ii)=='J'||ch(ii)=='K'||ch(ii)=='L'
        n=('5');
        out=[out n];
    elseif ch(ii)=='M'||ch(ii)=='N'||ch(ii)=='O'
        n=('6');
        out=[out n];
    elseif ch(ii)=='P'||ch(ii)=='Q'||ch(ii)=='R'||ch(ii)=='S'
        n=('7');
        out=[out n];
    elseif ch(ii)=='T'||ch(ii)=='U'||ch(ii)=='V'
        n=('8');
        out=[out n]; 
    elseif ch(ii)=='W'||ch(ii)=='X'||ch(ii)=='Y'||ch(ii)=='Z'
        n=('9');
        out=[out n];
    elseif ch(ii)=='1'||ch(ii)=='2'||ch(ii)=='3'||ch(ii)=='4'||ch(ii)=='5'...
            ||ch(ii)=='6'||ch(ii)=='7'||ch(ii)=='8'||ch(ii)=='9'||ch(ii)=='0'
        n=char(ch(ii));
        out=[out n];
    else 
        n=uint64(0);
        return
    end
end
n=str2double(out);
n=uint64(n);
end

