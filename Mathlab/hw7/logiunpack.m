function v = logiunpack(A)
%UNTITLED Summary of this function goes here
%   Detailed explanation goes here
v=logical(zeros(length(A))); %#ok<LOGL>
for ii=1:length(A)
    for jj=1:length(A{ii})
        s=(A{ii}(jj));
        v(ii,s)=true(1);
    end
end

end

