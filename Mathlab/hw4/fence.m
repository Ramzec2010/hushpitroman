function [ nOFseg, nOFpoles ] = fence( lng,seg)
nof=lng/seg;
nOFseg=ceil(nof);
nOFpoles=nOFseg+1;
end

