def xo(s):
	x = str(s).lower().count('x')
	o = str(s).lower().count('o')
	if x != 0 or o != 0:
		return x is o
	return len(s) is 0
