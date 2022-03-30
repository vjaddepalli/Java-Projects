JWT

JSON Web Token

	header.payload.signature
	
	header - algorithm used for token generation
	
	payload - additional information while generating the token(username,roles)
	
	
	signature - priate sensitive string value which validates this token
	(This string stored only on server not shared with client)
	(This string should be very complex so that it can't be guessed)
	
	eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.
	eyJleHAiOjE2NDc5MjY2NDIsInVzZXJuYW1lIjoiemVuc2FyIn0.
	X219wEimFaIG9NET2MZMDrupZv2nED_fNU-d4SsywCSEF-yhgBZMp2n6XK3SD-BtUezR83BD9c8liO643aKSIw