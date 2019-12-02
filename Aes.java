
class Aes
{
	public Aes()
	{
		byte sBox[] =
		{ /*  0    1    2    3    4    5    6    7    8    9    a    b    c    d    e    f */
		(byte)0x63, (byte)0x7c, (byte)0x77, (byte)0x7b, (byte)0xf2, (byte)0x6b, (byte)0x6f, (byte)0xc5, (byte)0x30, (byte)0x01, (byte)0x67, (byte)0x2b, (byte)0xfe, (byte)0xd7, (byte)0xab, (byte)0x76,  /*0*/
		(byte)0xca, (byte)0x82, (byte)0xc9, (byte)0x7d, (byte)0xfa, (byte)0x59, (byte)0x47, (byte)0xf0, (byte)0xad, (byte)0xd4, (byte)0xa2, (byte)0xaf, (byte)0x9c, (byte)0xa4, (byte)0x72, (byte)0xc0,  /*1*/
		(byte)0xb7, (byte)0xfd, (byte)0x93, (byte)0x26, (byte)0x36, (byte)0x3f, (byte)0xf7, (byte)0xcc, (byte)0x34, (byte)0xa5, (byte)0xe5, (byte)0xf1, (byte)0x71, (byte)0xd8, (byte)0x31, (byte)0x15,  /*2*/
		(byte)0x04, (byte)0xc7, (byte)0x23, (byte)0xc3, (byte)0x18, (byte)0x96, (byte)0x05, (byte)0x9a, (byte)0x07, (byte)0x12, (byte)0x80, (byte)0xe2, (byte)0xeb, (byte)0x27, (byte)0xb2, (byte)0x75,  /*3*/
		(byte)0x09, (byte)0x83, (byte)0x2c, (byte)0x1a, (byte)0x1b, (byte)0x6e, (byte)0x5a, (byte)0xa0, (byte)0x52, (byte)0x3b, (byte)0xd6, (byte)0xb3, (byte)0x29, (byte)0xe3, (byte)0x2f, (byte)0x84,  /*4*/
		(byte)0x53, (byte)0xd1, (byte)0x00, (byte)0xed, (byte)0x20, (byte)0xfc, (byte)0xb1, (byte)0x5b, (byte)0x6a, (byte)0xcb, (byte)0xbe, (byte)0x39, (byte)0x4a, (byte)0x4c, (byte)0x58, (byte)0xcf,  /*5*/
		(byte)0xd0, (byte)0xef, (byte)0xaa, (byte)0xfb, (byte)0x43, (byte)0x4d, (byte)0x33, (byte)0x85, (byte)0x45, (byte)0xf9, (byte)0x02, (byte)0x7f, (byte)0x50, (byte)0x3c, (byte)0x9f, (byte)0xa8,  /*6*/
		(byte)0x51, (byte)0xa3, (byte)0x40, (byte)0x8f, (byte)0x92, (byte)0x9d, (byte)0x38, (byte)0xf5, (byte)0xbc, (byte)0xb6, (byte)0xda, (byte)0x21, (byte)0x10, (byte)0xff, (byte)0xf3, (byte)0xd2,  /*7*/
		(byte)0xcd, (byte)0x0c, (byte)0x13, (byte)0xec, (byte)0x5f, (byte)0x97, (byte)0x44, (byte)0x17, (byte)0xc4, (byte)0xa7, (byte)0x7e, (byte)0x3d, (byte)0x64, (byte)0x5d, (byte)0x19, (byte)0x73,  /*8*/
		(byte)0x60, (byte)0x81, (byte)0x4f, (byte)0xdc, (byte)0x22, (byte)0x2a, (byte)0x90, (byte)0x88, (byte)0x46, (byte)0xee, (byte)0xb8, (byte)0x14, (byte)0xde, (byte)0x5e, (byte)0x0b, (byte)0xdb,  /*9*/
		(byte)0xe0, (byte)0x32, (byte)0x3a, (byte)0x0a, (byte)0x49, (byte)0x06, (byte)0x24, (byte)0x5c, (byte)0xc2, (byte)0xd3, (byte)0xac, (byte)0x62, (byte)0x91, (byte)0x95, (byte)0xe4, (byte)0x79,  /*a*/
		(byte)0xe7, (byte)0xc8, (byte)0x37, (byte)0x6d, (byte)0x8d, (byte)0xd5, (byte)0x4e, (byte)0xa9, (byte)0x6c, (byte)0x56, (byte)0xf4, (byte)0xea, (byte)0x65, (byte)0x7a, (byte)0xae, (byte)0x08,  /*b*/
		(byte)0xba, (byte)0x78, (byte)0x25, (byte)0x2e, (byte)0x1c, (byte)0xa6, (byte)0xb4, (byte)0xc6, (byte)0xe8, (byte)0xdd, (byte)0x74, (byte)0x1f, (byte)0x4b, (byte)0xbd, (byte)0x8b, (byte)0x8a,  /*c*/
		(byte)0x70, (byte)0x3e, (byte)0xb5, (byte)0x66, (byte)0x48, (byte)0x03, (byte)0xf6, (byte)0x0e, (byte)0x61, (byte)0x35, (byte)0x57, (byte)0xb9, (byte)0x86, (byte)0xc1, (byte)0x1d, (byte)0x9e,  /*d*/
		(byte)0xe1, (byte)0xf8, (byte)0x98, (byte)0x11, (byte)0x69, (byte)0xd9, (byte)0x8e, (byte)0x94, (byte)0x9b, (byte)0x1e, (byte)0x87, (byte)0xe9, (byte)0xce, (byte)0x55, (byte)0x28, (byte)0xdf,  /*e*/
		(byte)0x8c, (byte)0xa1, (byte)0x89, (byte)0x0d, (byte)0xbf, (byte)0xe6, (byte)0x42, (byte)0x68, (byte)0x41, (byte)0x99, (byte)0x2d, (byte)0x0f, (byte)0xb0, (byte)0x54, (byte)0xbb, (byte)0x16  /*f*/
		};
		byte invsBox[] =
		{ /*  0    1    2    3    4    5    6    7    8    9    a    b    c    d    e    f  */
		(byte)0x52, (byte)0x09, (byte)0x6a, (byte)0xd5, (byte)0x30, (byte)0x36, (byte)0xa5, (byte)0x38, (byte)0xbf, (byte)0x40, (byte)0xa3, (byte)0x9e, (byte)0x81, (byte)0xf3, (byte)0xd7, (byte)0xfb,  /*0*/
		(byte)0x7c, (byte)0xe3, (byte)0x39, (byte)0x82, (byte)0x9b, (byte)0x2f, (byte)0xff, (byte)0x87, (byte)0x34, (byte)0x8e, (byte)0x43, (byte)0x44, (byte)0xc4, (byte)0xde, (byte)0xe9, (byte)0xcb,  /*1*/
		(byte)0x54, (byte)0x7b, (byte)0x94, (byte)0x32, (byte)0xa6, (byte)0xc2, (byte)0x23, (byte)0x3d, (byte)0xee, (byte)0x4c, (byte)0x95, (byte)0x0b, (byte)0x42, (byte)0xfa, (byte)0xc3, (byte)0x4e,  /*2*/
		(byte)0x08, (byte)0x2e, (byte)0xa1, (byte)0x66, (byte)0x28, (byte)0xd9, (byte)0x24, (byte)0xb2, (byte)0x76, (byte)0x5b, (byte)0xa2, (byte)0x49, (byte)0x6d, (byte)0x8b, (byte)0xd1, (byte)0x25,  /*3*/
		(byte)0x72, (byte)0xf8, (byte)0xf6, (byte)0x64, (byte)0x86, (byte)0x68, (byte)0x98, (byte)0x16, (byte)0xd4, (byte)0xa4, (byte)0x5c, (byte)0xcc, (byte)0x5d, (byte)0x65, (byte)0xb6, (byte)0x92,  /*4*/
		(byte)0x6c, (byte)0x70, (byte)0x48, (byte)0x50, (byte)0xfd, (byte)0xed, (byte)0xb9, (byte)0xda, (byte)0x5e, (byte)0x15, (byte)0x46, (byte)0x57, (byte)0xa7, (byte)0x8d, (byte)0x9d, (byte)0x84,  /*5*/
		(byte)0x90, (byte)0xd8, (byte)0xab, (byte)0x00, (byte)0x8c, (byte)0xbc, (byte)0xd3, (byte)0x0a, (byte)0xf7, (byte)0xe4, (byte)0x58, (byte)0x05, (byte)0xb8, (byte)0xb3, (byte)0x45, (byte)0x06,  /*6*/
		(byte)0xd0, (byte)0x2c, (byte)0x1e, (byte)0x8f, (byte)0xca, (byte)0x3f, (byte)0x0f, (byte)0x02, (byte)0xc1, (byte)0xaf, (byte)0xbd, (byte)0x03, (byte)0x01, (byte)0x13, (byte)0x8a, (byte)0x6b,  /*7*/
		(byte)0x3a, (byte)0x91, (byte)0x11, (byte)0x41, (byte)0x4f, (byte)0x67, (byte)0xdc, (byte)0xea, (byte)0x97, (byte)0xf2, (byte)0xcf, (byte)0xce, (byte)0xf0, (byte)0xb4, (byte)0xe6, (byte)0x73,  /*8*/
		(byte)0x96, (byte)0xac, (byte)0x74, (byte)0x22, (byte)0xe7, (byte)0xad, (byte)0x35, (byte)0x85, (byte)0xe2, (byte)0xf9, (byte)0x37, (byte)0xe8, (byte)0x1c, (byte)0x75, (byte)0xdf, (byte)0x6e,  /*9*/
		(byte)0x47, (byte)0xf1, (byte)0x1a, (byte)0x71, (byte)0x1d, (byte)0x29, (byte)0xc5, (byte)0x89, (byte)0x6f, (byte)0xb7, (byte)0x62, (byte)0x0e, (byte)0xaa, (byte)0x18, (byte)0xbe, (byte)0x1b,  /*a*/
		(byte)0xfc, (byte)0x56, (byte)0x3e, (byte)0x4b, (byte)0xc6, (byte)0xd2, (byte)0x79, (byte)0x20, (byte)0x9a, (byte)0xdb, (byte)0xc0, (byte)0xfe, (byte)0x78, (byte)0xcd, (byte)0x5a, (byte)0xf4,  /*b*/
		(byte)0x1f, (byte)0xdd, (byte)0xa8, (byte)0x33, (byte)0x88, (byte)0x07, (byte)0xc7, (byte)0x31, (byte)0xb1, (byte)0x12, (byte)0x10, (byte)0x59, (byte)0x27, (byte)0x80, (byte)0xec, (byte)0x5f,  /*c*/
		(byte)0x60, (byte)0x51, (byte)0x7f, (byte)0xa9, (byte)0x19, (byte)0xb5, (byte)0x4a, (byte)0x0d, (byte)0x2d, (byte)0xe5, (byte)0x7a, (byte)0x9f, (byte)0x93, (byte)0xc9, (byte)0x9c, (byte)0xef,  /*d*/
		(byte)0xa0, (byte)0xe0, (byte)0x3b, (byte)0x4d, (byte)0xae, (byte)0x2a, (byte)0xf5, (byte)0xb0, (byte)0xc8, (byte)0xeb, (byte)0xbb, (byte)0x3c, (byte)0x83, (byte)0x53, (byte)0x99, (byte)0x61,  /*e*/
		(byte)0x17, (byte)0x2b, (byte)0x04, (byte)0x7e, (byte)0xba, (byte)0x77, (byte)0xd6, (byte)0x26, (byte)0xe1, (byte)0x69, (byte)0x14, (byte)0x63, (byte)0x55, (byte)0x21, (byte)0x0c, (byte)0x7d  /*f*/
		};
		Sbox = sBox;
		InvSbox = invsBox;
		KeyExpansion(key(), w);
	}

	private byte Sbox[];
	private byte InvSbox[];
	private byte w[][][] = new byte[11][4][4];
	
	byte[] Cipher(byte[] input)
	{
		byte state[][] = new byte[4][4];
		int i, r, c;
	
		for (r = 0; r < 4; r++)
		{
			for (c = 0; c < 4; c++)
			{
				state[r][c] = input[c * 4 + r];
			}
		}
	
		AddRoundKey(state, w[0]);
	
		for (i = 1; i <= 10; i++)
		{
			SubBytes(state);
			ShiftRows(state);
			if (i != 10)MixColumns(state);
			AddRoundKey(state, w[i]);
		}
	
		for (r = 0; r < 4; r++)
		{
			for (c = 0; c < 4; c++)
			{
				input[c * 4 + r] = state[r][c];
			}
		}
	
		return input;
	}
	
	byte[] InvCipher(byte[] input)
	{
		byte state[][] = new byte[4][4];
		int i, r, c;
	
		for (r = 0; r < 4; r++)
		{
			for (c = 0; c < 4; c++)
			{
				state[r][c] = input[c * 4 + r];
			}
		}
	
		AddRoundKey(state, w[10]);
		for (i = 9; i >= 0; i--)
		{
			InvShiftRows(state);
			InvSubBytes(state);
			AddRoundKey(state, w[i]);
			if (i != 0)
			{
				InvMixColumns(state);
			}
		}
	
		for (r = 0; r < 4; r++)
		{
			for (c = 0; c < 4; c++)
			{
				input[c * 4 + r] = state[r][c];
			}
		}
	
		return input;
	}
	
	byte[] Cipher(byte[] input, int length)
	{
		byte[] in = input;
		int i;
		for (i = 0; i < length; i += 16)
		{
			byte[] bytes = new byte[in.length - i];
			for(int j = 0;j < bytes.length ;++j)
			{
				bytes[j] = in[j + i];
			}
			Cipher(bytes);
			for(int j = 0;j < bytes.length;++j)
			{
				in[j + i] = bytes[j];
			}
		}
		return input;
	}
	
	byte[] InvCipher(byte[] input, int length)
	{
		byte[] in = input;
		int i;
		for (i = 0; i < length; i += 16)
		{
			byte[] bytes = new byte[in.length - i];
			for(int j = 0;j < bytes.length;++j)
			{
				bytes[j] = in[j + i];
			}
			InvCipher(bytes);
			for(int j = 0;j < bytes.length;++j)
			{
				input[j + i] = bytes[j];
			}
		}
		return input;
	}

	void KeyExpansion(byte key[], byte w[][][])
	{
		int i, j, r, c;
		byte rc[] = new byte[]{ 0x01, 0x02, 0x04, 0x08, 0x10, 0x20, 0x40, (byte)0x80, 0x1b, 0x36 };
		for (r = 0; r < 4; r++)
		{
			for (c = 0; c < 4; c++)
			{
				w[0][r][c] = key[r + c * 4];
			}
		}
		for (i = 1; i <= 10; i++)
		{
			for (j = 0; j < 4; j++)
			{
				byte t[] = new byte[4];
				for (r = 0; r < 4; r++)
				{
					t[r] = j != 0 ? w[i][r][j - 1] : w[i - 1][r][3];
				}
				if (j == 0)
				{
					int temp = t[0] >= 0 ? t[0] : (256 + t[0]);
					for (r = 0; r < 3; r++)
					{
						int index = t[(r + 1) % 4];
						if(index < 0)
						{
							index += 256;
						}
						t[r] = Sbox[index];
					}
					t[3] = Sbox[temp];
					t[0] ^= rc[i - 1];
				}
				for (r = 0; r < 4; r++)
				{
					w[i][r][j] = (byte)(w[i - 1][r][j] ^ t[r]);
				}
			}
		}
	}
	byte FFmul(byte a, byte b)
	{
		byte bw[] = new byte[4];
		byte res = 0;
		int i;
		bw[0] = b;
		for (i = 1; i < 4; i++)
		{
			bw[i] = (byte)(bw[i - 1] << 1);
			if ((bw[i - 1] & 0x80) != 0)
			{
				bw[i] ^= 0x1b;
			}
		}
		for (i = 0; i < 4; i++)
		{
			if (((a >> i) & 0x01) != 0)
			{
				res ^= bw[i];
			}
		}
		return res;
	}

	void SubBytes(byte state[][])
	{
		int r, c;
		for (r = 0; r < 4; r++)
		{
			for (c = 0; c < 4; c++)
			{
				int index = state[r][c];
				if(index < 0)
				{
					index += 256;
				}
				state[r][c] = Sbox[index];
			}
		}
	}
	void ShiftRows(byte state[][])
	{
		byte t[] = new byte[4];
		int r, c;
		for (r = 1; r < 4; r++)
		{
			for (c = 0; c < 4; c++)
			{
				t[c] = state[r][(c + r) % 4];
			}
			for (c = 0; c < 4; c++)
			{
				state[r][c] = t[c];
			}
		}
	}
	void MixColumns(byte state[][])
	{
		byte t[] = new byte[4];
		int r, c;
		for (c = 0; c < 4; c++)
		{
			for (r = 0; r < 4; r++)
			{
				t[r] = state[r][c];
			}
			for (r = 0; r < 4; r++)
			{
				state[r][c] = (byte)(FFmul((byte)0x02, t[r])
					^ FFmul((byte)0x03, t[(r + 1) % 4])
					^ FFmul((byte)0x01, t[(r + 2) % 4])
					^ FFmul((byte)0x01, t[(r + 3) % 4]));
			}
		}
	}
	void AddRoundKey(byte state[][], byte k[][])
	{
		int r, c;
		for (c = 0; c < 4; c++)
		{
			for (r = 0; r < 4; r++)
			{
				state[r][c] ^= k[r][c];
			}
		}
	}

	void InvSubBytes(byte state[][])
	{
		int r, c;
		for (r = 0; r < 4; r++)
		{
			for (c = 0; c < 4; c++)
			{
				int index = state[r][c];
				if(index < 0)
				{
					index += 256;
				}
				state[r][c] = InvSbox[index];
			}
		}
	}
	void InvShiftRows(byte state[][])
	{
		byte t[] = new byte[4];
		int r, c;
		for (r = 1; r < 4; r++)
		{
			for (c = 0; c < 4; c++)
			{
				t[c] = state[r][(c - r + 4) % 4];
			}
			for (c = 0; c < 4; c++)
			{
				state[r][c] = t[c];
			}
		}
	}
	void InvMixColumns(byte state[][])
	{
		byte t[] = new byte[4];
		int r, c;
		for (c = 0; c < 4; c++)
		{
			for (r = 0; r < 4; r++)
			{
				t[r] = state[r][c];
			}
			for (r = 0; r < 4; r++)
			{
				state[r][c] = (byte)(FFmul((byte)0x0e, t[r])
					^ FFmul((byte)0x0b, t[(r + 1) % 4])
					^ FFmul((byte)0x0d, t[(r + 2) % 4])
					^ FFmul((byte)0x09, t[(r + 3) % 4]));
			}
		}
	}

	byte[] key()
	{
		byte key_static[] = new byte[]{
		0x3e, 0x74, 0x72, 0x9, 0x42, 0x9, 0x13, 0x48,
		0x5e, 0x6e, 0x76, 0x23, 0x1, 0x26, 0x28, 0x42,
		0x44, 0x38, 0x20, 0x10, 0x7b, 0x78, 0x74, 0x19,
		0xa, 0x7, 0x4d, 0x36, 0x7b, 0x1d, 0x19, 0x6d };
		return key_static;
	}
}