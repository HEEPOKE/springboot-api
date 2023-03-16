-- Create the shop table
CREATE TABLE shop (
  id SERIAL PRIMARY KEY,
  name VARCHAR(255) NOT NULL UNIQUE,
  description VARCHAR(255),
  tel VARCHAR(255) UNIQUE,
  owner_id INTEGER,
  created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

-- Create the trigger function to update the updated_at column
CREATE OR REPLACE FUNCTION update_updated_at_column()
RETURNS TRIGGER AS $$
BEGIN
  NEW.updated_at = NOW();
  RETURN NEW;
END;
$$ LANGUAGE plpgsql;

-- Create the trigger that uses the function
CREATE TRIGGER update_shop_updated_at
  BEFORE UPDATE ON shop
  FOR EACH ROW
  EXECUTE FUNCTION update_updated_at_column();
