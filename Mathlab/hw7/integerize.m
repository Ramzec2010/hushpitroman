function b=integerize(A)
%UNTITLED Summary of this function goes here
%   Detailed explanation goes here
if A==int8(A)
    b='int8';
elseif A==int16(A)
    b='int16';
elseif A==int32(A)
    b='int32';
elseif A==int64(A)
    b='int64';
else
    b='NONE';
end
end

