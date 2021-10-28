local solution = require 'kyu8_HeadsAndLegs'

describe("Example test cases", function()
  it("Valid number of animals", function()
    assert.are.same({44, 28}, solution.animals(72, 200))
    assert.are.same({91, 25}, solution.animals(116, 282))
    assert.are.same({12, 0}, solution.animals(12, 24))
    assert.are.same({0, 6}, solution.animals(6, 24))
    assert.are.same({252, 92}, solution.animals(344, 872))
    assert.are.same({8, 150}, solution.animals(158, 616))
    assert.are.same({44, 28}, solution.animals(72, 200))
  end)
  it("Invalid number of animals", function()
    assert.are.same("No solutions", solution.animals(25, 555))
    assert.are.same("No solutions", solution.animals(12, 25))
    assert.are.same("No solutions", solution.animals(54, 956))
    assert.are.same("No solutions", solution.animals(5455, 54956))
  end)
  it("Edge cases", function()
    assert.are.same({0, 0}, solution.animals(0, 0))
    assert.are.same("No solutions", solution.animals(-1, -1))
    assert.are.same("No solutions", solution.animals(-45, 5))
    assert.are.same("No solutions", solution.animals(500, 0))
    assert.are.same("No solutions", solution.animals(0, 500))
    assert.are.same("No solutions", solution.animals(5, -55))
    assert.are.same("No solutions", solution.animals(-72, -200))
    assert.are.same("No solutions", solution.animals(-463, -2754))
  end)
end)
